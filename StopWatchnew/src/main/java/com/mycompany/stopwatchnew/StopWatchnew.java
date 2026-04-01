/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stopwatchnew;

/**
 *
 * @author My MSI
 */

import java.util.Random;

public class StopWatchnew {

    // class StopWatch 
    static class StopWatch {
        private long startTime;
        private long endTime;

        // konstruktor tanpa argumen
        public StopWatch() {
            this.startTime = System.currentTimeMillis();
            this.endTime = this.startTime;
        }

        // getter
        public long getStartTime() {
            return startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        // mulai hitung waktu
        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        // berhenti hitung waktu
        public void stop() {
            this.endTime = System.currentTimeMillis();
        }

        // hitung selisih waktu
        public long getElapsedTime() {
            return endTime - startTime;
        }
    }

    // method selection sort
    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[100000];
        Random rand = new Random();

        // isi array dengan angka acak
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100000);
        }

        StopWatch sw = new StopWatch();

        sw.start();
        selectionSort(data);
        sw.stop();

        System.out.println("PROGRAM STOPWATCH");
        System.out.println("Jumlah data yang diurutkan : 100000");
        System.out.println("Waktu mulai                : " + sw.getStartTime());
        System.out.println("Waktu selesai              : " + sw.getEndTime());
        System.out.println("Waktu eksekusi             : " + sw.getElapsedTime() + " ms");
    }
}
