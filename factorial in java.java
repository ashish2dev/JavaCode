public int factorial(int f) {
        if(f == 1) {
            return f;
        } else {
            f = f * factorial(f - 1);
            return f;
        }
    }
