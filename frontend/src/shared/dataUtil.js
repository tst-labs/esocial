export function toStringDate(data) {
  if (typeof data.toISOString === "function") {
    return data.toISOString().split("T")[0];
  }
  return data;
}

export function normalizarData(date) {
  let returnDate = date;
  const sufixo = " 00:00:00";

  if (typeof date === "string") {
    if (!returnDate.includes(sufixo)) {
      returnDate += sufixo;
    }
    returnDate = new Date(returnDate);
  }

  return returnDate;
}

export function formataData(data) {
  if (!data) {
    return "";
  }

  let novaData = data;

  if (Array.isArray(data)) {
    novaData = new Date(data);
  }

  novaData = toStringDate(novaData);
  return novaData.split("-").reverse().join("/");
}

export function formataDataLong(data) {
  if (!data) {
    return "";
  }
  const novaData = normalizarData(data);
  let value = novaData.toLocaleDateString("pt-BR", {
    year: "numeric",
    month: "long",
    day: "numeric"
  });

  if (value.startsWith("1 ")) {
    value = value.replace("1 ", "1º ");
  }

  return value;
}

export function formataDataTempoLong(data) {
  const novaData = new Date(data);

  let value = novaData.toLocaleDateString("pt-BR", {
    year: "numeric",
    month: "long",
    day: "numeric",
    hour: "numeric",
    minute: "numeric"
  });

  if (value.startsWith("1 ")) {
    value = value.replace("1 ", "1º ");
  }

  return value;
}

export function diaAnterior(data) {
  const anterior = new Date(data.getTime());
  anterior.setDate(anterior.getDate() - 1);
  return anterior;
}

export function addDias(data, dias) {
  const novoDia = new Date(data.getTime());
  novoDia.setDate(novoDia.getDate() + dias);
  return novoDia;
}

export function clampData(theDate, minDate, maxDate) {
  // eslint-disable-next-line
  return theDate <= minDate
    ? new Date(minDate)
    : theDate >= maxDate
    ? new Date(maxDate)
    : new Date(theDate);
}
