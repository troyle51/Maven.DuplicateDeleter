package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] newArr = new String[array.length];
        int idx = 0;

        for(int i = 0; i < newArr.length; i++){
            int counter = 0;

            for(int j = 0; j < newArr.length; j++){
                if(array[i] == array[j]){
                    counter++;
                }
            }

            if(counter < maxNumberOfDuplications){
                newArr[idx] = array[i];
                idx++;
            }
        }

        int nullIndexes = 0;
        for(int i = 0; i < array.length; i++){
            if(newArr[i] == null){
                nullIndexes++;
            }
        }

        String[] newArr2 = new String[array.length - nullIndexes];
        for(int i = 0; i < newArr2.length; i++){
            newArr2[i] = newArr[i];
        }
        return newArr2;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] newArr = new String[array.length];
        int idx = 0;

        for(int i = 0; i < newArr.length; i++){
            int counter = 0;

            for(int j = 0; j < newArr.length; j++){
                if(array[i] == array[j]){
                    counter++;
                }
            }

            if(counter != exactNumberOfDuplications){
                newArr[idx] = array[i];
                idx++;
            }
        }

        int nullIndexes = 0;
        for(int i = 0; i < array.length; i++){
            if(newArr[i] == null){
                nullIndexes++;
            }
        }

        String[] newArr2 = new String[array.length - nullIndexes];
        for(int i = 0; i < newArr2.length; i++){
            newArr2[i] = newArr[i];
        }
        return newArr2;
    }
}
