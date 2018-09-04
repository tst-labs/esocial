export function getBaseUrlForProject(project) {
  if (process.env.BASE_URL) {
    return `${process.env.BASE_URL}/${project}`;
  } else {
    const pathArray = location.href.split("/");
    const protocol = "";
    const host = pathArray[2];

    return `${protocol}//${host}/${project}`;
  }
}
