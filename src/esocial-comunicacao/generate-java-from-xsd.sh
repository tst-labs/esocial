EncontrarArquivo() {
    if [ -d "$1" ]; then
        for LINE in $(ls "$1")
        do
            if [ -d "$1"/$LINE ]; then
                PACKAGE=$( echo $LINE | sed --expression 's/\([A-Z]\)/.\L\1/g' --expression 's/^.//')
                MOUNT_PACKAGE=$2.$PACKAGE
                EncontrarArquivo $1/$LINE $MOUNT_PACKAGE
            else 
                EncontrarArquivo $1/$LINE $1 $2
            fi
        done
    else 
        echo "<=================================================>"
        echo "<== Arquivo sendo convertido =====> " $1
        echo "<== Diretório onde se encontra ===> " $2
        echo "<== Package ======================> " $3
        echo "<=================================================>"
        xjc -nv -d $DEST -p "$BASE_PACKAGE$3" $1
    fi
}

DIR=src/main/resources/XSD
DEST=src/main/java
BASE_PACKAGE=br.jus.esocialjt.comunicacao

mkdir -p $DEST

EncontrarArquivo $DIR
