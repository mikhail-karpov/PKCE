package com.mikhailkarpov.pkce;

import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) {

        try {
            String codeVerifier = PKCEUtil.generateCodeVerifier();
            System.out.println("Code verifier: " + codeVerifier);

            String codeChallenge = PKCEUtil.generateCodeChallenge(codeVerifier);
            System.out.println("Code challenge: " + codeChallenge);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}