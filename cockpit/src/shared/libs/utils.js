export function filter(haystack, needle) {
  if (!haystack || !needle) return true;
  return ("" + haystack).toLowerCase().indexOf(needle.toLowerCase()) >= 0;
}

export function filterAny(needle, ...haystacks) {
  return haystacks
    .filter(haystack => haystack)
    .reduce((found, haystack) => found || filter(haystack, needle), false);
}

export async function sleep(timeout) {
  return new Promise(resolve => setTimeout(resolve, timeout));
}
