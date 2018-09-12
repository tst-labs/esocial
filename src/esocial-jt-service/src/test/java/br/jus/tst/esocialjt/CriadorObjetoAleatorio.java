package br.jus.tst.esocialjt;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class CriadorObjetoAleatorio {
	
	private CriadorObjetoAleatorio() {
	}

	private static Random random = new Random();

	public static <T> T criarEPreencher(Class<T> clazz) {
		T instance = null;

		try {
			instance = clazz.newInstance();
			List<Field> fields = new ArrayList<>();
			fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
			for (Field field : getAllFields(fields, clazz)) {
				field.setAccessible(true);
				if((field.getModifiers() & Modifier.FINAL) != Modifier.FINAL) {
					Object value = getRandomValueForField(field);
					field.set(instance, value);
				}
			}
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		return instance;
	}
	
	private static List<Field> getAllFields(List<Field> fields, Class<?> clazz) {
	    fields.addAll(Arrays.asList(clazz.getDeclaredFields()));

	    if (clazz.getSuperclass() != null) {
	        getAllFields(fields, clazz.getSuperclass());
	    }

	    return fields;
	}

	private static Object getRandomValueForField(Field field) {
		Class<?> type = field.getType();
		
		if (type.isEnum()) {
			Object[] enumValues = type.getEnumConstants();
			return enumValues[random.nextInt(enumValues.length)];
		} else if (type.equals(Integer.TYPE) || type.equals(Integer.class)) {
			return random.nextInt(Byte.MAX_VALUE)+1;
		} else if (type.equals(Long.TYPE) || type.equals(Long.class)) {
			return random.nextLong();
		} else if (type.equals(Double.TYPE) || type.equals(Double.class)) {
			return random.nextDouble();
		} else if (type.equals(Float.TYPE) || type.equals(Float.class)) {
			return random.nextFloat();
		} else if (type.equals(Boolean.TYPE) || type.equals(Boolean.class)) {
			return random.nextDouble() < 0.5;
		} else if (type.equals(Byte.TYPE) || type.equals(Byte.class)) {
			return (byte)(random.nextInt(Byte.MAX_VALUE)+1);
		} else if (type.equals(String.class)) {
			return UUID.randomUUID().toString();
		} else if (type.equals(BigInteger.class)) {
			return BigInteger.valueOf(1);
		} else if (type.equals(BigDecimal.class)) {
			return BigDecimal.valueOf(random.nextInt(Byte.MAX_VALUE));
		} else if (type.equals(Date.class)) {
			return randomDate();
		} else if (type.equals(Calendar.class)) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(randomDate());
			return cal;
		} else if (type.equals(List.class)) {
			ArrayList<Object> lista = new ArrayList<>();
			Type genericType = field.getGenericType();
			
			if (genericType instanceof ParameterizedType) {
	            ParameterizedType pt = (ParameterizedType) genericType;
	            for (Type t : pt.getActualTypeArguments()) {
	            	lista.add(criarEPreencher((Class<?>) t));
	            }
	        }
			return lista;
		}
		
		return criarEPreencher(type);
	}
	
	private static Date randomDate() {
		long    ms = -946771200000L + (Math.abs(random.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
		return new Date(ms);
	}

}
