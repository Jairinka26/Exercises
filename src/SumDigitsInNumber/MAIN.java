/*
 * Copyright (c) 1997-2013 InfoReach, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * InfoReach ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with InfoReach.
 *
 * CopyrightVersion 2.0
 */
package SumDigitsInNumber;

/**
 * TODO: add description
 *
 * @author Irina.Paschenko
 */
public class MAIN {
    public static void main(String[] args)
    {
        init();
    }

    static void init(){
        Ex1 ex1 = new Ex1();
        System.out.println(ex1.digital_root(942));
    }

}
