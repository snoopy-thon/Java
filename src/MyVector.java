// 0825 MyVector 프린트
public class MyVector {
    Object[] objArr = null;
    int size = 0;
    int capacity = 0;
    MyVector(){
        this(16);
    }
    MyVector(int capacity){
        this.capacity = capacity;
        objArr = new Object[capacity];
    }

    int size(){
        return size;
    }

    int capacity(){
        return objArr.length;
    }

    boolean isEmpty(){
        return size == 0;
    }

    void add(Object obj){ // 객체 배열(objArr)에 obj를 추가한다.
        // 1. 저장공간 확인
        if(capacity - size > 0){}
        //  1-1. 있으면 저장
        //   objArr[size++] = obj;
        //  1-2. 없으면
        else{
            //  1-2-1. 저장 공간 늘리기 (2배로)
            capacity *= 2;
            //  1-2-2. 저장하기
            // objArr[size++] = obj;
        } objArr[size++] = obj;
    }

    Object get(int index){
        return objArr[index];
    }

    @Override
   // public String toString() {
        //return ;
    //}
}
