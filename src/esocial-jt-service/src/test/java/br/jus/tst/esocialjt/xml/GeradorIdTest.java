package br.jus.tst.esocialjt.xml;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeradorIdTest {

	private static final long CINCO_SEGUNDOS = 5000l;

	@Autowired
	private GeradorId geradorId;
	
	private static final String CNPJ = "00509968000148";

	@Test
	public void verificarGeracaoDoId() throws ParseException {

		String id = geradorId.gerarId(CNPJ);
		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(id.substring(0, 3)).isEqualTo("ID1");
		soft.assertThat(id.substring(3, 17)).isEqualTo(CNPJ);
		soft.assertThat(diferencaTempo(id)).isLessThan(CINCO_SEGUNDOS);
		soft.assertThat(StringUtils.isNumeric(id.substring(31))).isTrue();
		soft.assertAll();

	}

	private long diferencaTempo(String id) throws ParseException {
		String strData = id.substring(17, 31);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		long tempoGeracao = sdf.parse(strData).getTime();
		long tempoAgora = new Date().getTime();
		long diferencaTempo = Math.abs(tempoGeracao-tempoAgora);
		return diferencaTempo;
	}

}
