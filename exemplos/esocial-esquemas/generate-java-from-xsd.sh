#!/bin/sh
DIR=src/main/resources/xsd/eventos
VERSAO=v02_04_02
DEST=target/generated-sources/xsd/java
BASE_PACKAGE=br.jus.tst.esocial.esquemas.eventos

mkdir -p $DEST
rm -rf $DEST/*

for FILE in $(ls $DIR/$VERSAO | grep evt)
do 
    PACKAGE=$(basename "$FILE" .xsd | cut -c4-| tr  "[:upper:]" "[:lower:]")
    xjc -nv -d $DEST -p "$BASE_PACKAGE.$PACKAGE" $DIR/$VERSAO/$FILE
done