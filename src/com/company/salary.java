package com.company;

 class salary {
    public static void main(String[] args)
    {



        float basic=25000;
        float DA,HRA,CCA,PF,PT;
        float gross,net;

        DA=(float) (0.7*basic);
        HRA=(float)(0.3*basic);
        CCA=240;
        PF=(float) (0.1*basic);
        PT=100;

        gross=DA+HRA+CCA+basic;
        System.out.println("gross salary is:" + gross);
        net=gross-(PF+PT);
        System.out.println("\nnet salary is:" + net);
    }

}
