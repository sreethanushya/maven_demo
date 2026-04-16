package com.example;
public class solution
  {
    public int add (int a , int b)
    {
      return a+b;
        }
    public int sub ( int a , int b)
    {
      return a-b;
        }
    public int mul (int a , int b)
    {
      return a*b;
    }
    public int div(int a , int b)
    {
      if (b==0)
      {
        throw new IllegalArgumentException("cannot divide by zero");
      }
      return a/b;
    }
  }

