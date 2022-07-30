package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] newArr = new Integer[array.length];
        int idx = 0;

        for(int i = 0; i < newArr.length; i++){
            int counter = 0;
//            for(Integer integer : array){
//                if(array[i] == integer){
//                    counter++;
//                }
//            }
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

        Integer[] newArr2 = new Integer[array.length - nullIndexes];
        for(int i = 0; i < newArr2.length; i++){
            newArr2[i] = newArr[i];
        }
        return newArr2;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] newArr = new Integer[array.length];
        int idx = 0;

        for(int i = 0; i < newArr.length; i++){
            int counter = 0;
//            for(Integer integer : array){
//                if(array[i] == integer){
//                    counter++;
//                }
//            }
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

        Integer[] newArr2 = new Integer[array.length - nullIndexes];
        for(int i = 0; i < newArr2.length; i++){
            newArr2[i] = newArr[i];
        }
        return newArr2;
    }

}
