/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku4x4;

import javafx.util.Pair;

/**
 *
 *
 */
public class Sudoku4x4 {

    // Pembuatan Soal 

    static int[][] kotak = {{1, 0, 0, 0},
    {0, 2, 0, 0},
    {0, 0, 3, 0},
    {0, 0, 0, 4}
    };

    static boolean ada_kosong() {
        boolean ada = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kotak[i][j] == 0) {
                    ada = true;
                    return ada;
                }
            }
        }
        return ada;
    }

    static Pair<Integer, Integer> cari_posisi_kosong() {
        int x, y;
        Pair<Integer, Integer> posisi = new Pair(0, 0);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kotak[i][j] == 0) {
                    x = i;
                    y = j;
                    posisi = new Pair(i, j);
                    return posisi;
                }
            }
        }
        return posisi;
    }

    static void cetak() {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(kotak[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Cek nilai di bagian kolom

    static boolean nilai_kolom(int x, int y, int nilai) {

        boolean memenuhi = true;
        for (int i = 0; i < 4; i++) {
            if (i == x) {
                continue;
            } else if (kotak[i][y] == nilai) {
                memenuhi = false;
                return memenuhi;
            }
        }
        return memenuhi;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}
