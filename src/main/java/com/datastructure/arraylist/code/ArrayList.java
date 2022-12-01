package com.datastructure.arraylist.code;

public class ArrayList {
    String[] data;

    public ArrayList(String[] strings) {
        data = strings;
    }

    public void add(String str) {
        String[] oldData = data;
        data = new String[oldData.length + 1];

        for(int i=0; i<oldData.length; i++) {
            data[i] = oldData[i];
        }

        data[data.length - 1] = str;
    }

    public void add(int idx, String str) {
        String[] oldData = data;
        data = new String[oldData.length + 1];

        for(int i=0; i<oldData.length; i++) {
            if(i < idx) {
                data[i] = oldData[i];
            } else {
                data[i+1] = oldData[i];
            }
        }

        data[idx] = str;
    }

    public void remove() {
        int cursor = data.length - 1;

        while(true) {
            if(data[cursor] != null) {
                data[cursor] = null;
                break;
            }

            cursor--;
        }
    }

    public void remove(int idx) {
        data[idx] = null;

        for(int i=idx+1; i<data.length; i++) {
            data[i-1] = data[i];
        }

        data[data.length - 1] = null;
    }

    public void update(int idx, String str) {
        data[idx] = str;
    }

    public String get(int idx) {
        return data[idx];
    }

    public void print() {
        for(int i=0; i<data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}