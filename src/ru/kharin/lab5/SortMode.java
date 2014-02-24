package ru.kharin.lab5;

import java.util.Comparator;

public class SortMode implements Comparator<Polyhedron>{
    
    private boolean sortUp;
    private int sortMode;
    
    public SortMode(boolean sortUp, int sortMode) {
        this.sortUp = sortUp;
        this.sortMode = sortMode;
    }
    @Override
    public int compare(Polyhedron o1, Polyhedron o2) {
        int res = 0;
        switch(sortMode){
            case 0: {
                        if (o1.getId() > o2.getId()) res = 1;
                        else if (o1.getId() < o2.getId()) res = -1;
                    }break;
            case 1: { 
                        res = o1.getName().compareTo(o2.getName());
                    }break;
            case 2: {
                        if (o1.getA() > o2.getA()) res = 1;
                        else if  (o1.getA() < o2.getA()) res = -1;
                    }break;
        }
        if (sortUp) res *= (-1);
        return res;
    }
}
