package com.example.tictactoe;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.lang.reflect.Array;
import java.util.Random;

/* loaded from: classes3.dex */
public class MainActivity extends AppCompatActivity {
    int q = 0;
    int Ac = 0;
    int w1 = 0;
    int k = 0;
    int p = 0;
    int[] y = new int[3];
    int[] r = new int[9];
    int[] g = new int[3];
    int[][] e = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 3);

    public void hell(View view) {
        Button u;
        int i;
        int col;
        int row;
        int i2;
        if (this.Ac == 0) {
            Toast.makeText(this, "Select the Player User or Bot", 0).show();
            return;
        }
        if (this.Ac == 1) {
            this.w1++;
            Button u2 = (Button) findViewById(R.id.play);
            if (this.w1 == 1) {
                u2.setVisibility(0);
            }
            Button b = (Button) findViewById(view.getId());
            Button button1 = (Button) findViewById(R.id.button1);
            Button button2 = (Button) findViewById(R.id.button2);
            Button button3 = (Button) findViewById(R.id.button3);
            Button button4 = (Button) findViewById(R.id.button4);
            Button button5 = (Button) findViewById(R.id.button5);
            Button button6 = (Button) findViewById(R.id.button6);
            Button button7 = (Button) findViewById(R.id.button7);
            Button button8 = (Button) findViewById(R.id.button8);
            Button button9 = (Button) findViewById(R.id.button9);
            if (this.q == 0) {
                b.setText("X");
                this.q++;
                b.setEnabled(false);
            } else {
                b.setText("O");
                b.setEnabled(false);
                this.q--;
            }
            int row2 = -1;
            int col2 = -1;
            if (b == button1) {
                row2 = 0;
                col2 = 0;
            } else if (b == button2) {
                row2 = 0;
                col2 = 1;
            } else if (b == button3) {
                row2 = 0;
                col2 = 2;
            } else if (b == button4) {
                row2 = 1;
                col2 = 0;
            } else if (b == button5) {
                row2 = 1;
                col2 = 1;
            } else if (b == button6) {
                row2 = 1;
                col2 = 2;
            } else if (b == button7) {
                row2 = 2;
                col2 = 0;
            } else if (b == button8) {
                row2 = 2;
                col2 = 1;
            } else if (b == button9) {
                row2 = 2;
                col2 = 2;
            }
            if (this.q == 1) {
                this.e[row2][col2] = 1;
            } else {
                this.e[row2][col2] = 0;
            }
            if (this.w1 == 9) {
                u2.setText("Play Again");
                int i3 = 0;
                while (true) {
                    if (i3 >= 3) {
                        break;
                    }
                    int j = 0;
                    for (int i4 = 3; j < i4; i4 = 3) {
                        int[] iArr = this.g;
                        iArr[i3] = iArr[i3] + this.e[i3][j];
                        j++;
                        u2 = u2;
                    }
                    System.out.println(this.g[i3]);
                    i3++;
                    u2 = u2;
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= 3) {
                        break;
                    }
                    int j2 = 0;
                    for (int i6 = 3; j2 < i6; i6 = 3) {
                        int[] iArr2 = this.y;
                        iArr2[i5] = iArr2[i5] + this.e[j2][i5];
                        j2++;
                        button8 = button8;
                    }
                    i5++;
                }
                for (int i7 = 0; i7 < 3; i7++) {
                    if (this.y[i7] == 0) {
                        i2 = 1;
                        this.p++;
                    } else {
                        i2 = 1;
                    }
                    if (this.g[i7] == 0) {
                        this.p += i2;
                    }
                    if (this.y[i7] == 3) {
                        this.k += i2;
                    }
                    if (this.g[i7] == 3) {
                        this.k += i2;
                    }
                }
                int i8 = this.k;
                if (i8 > 0 && this.p > 0) {
                    Toast.makeText(this, "Draw", 0).show();
                    return;
                }
                if (this.k > 0) {
                    Toast.makeText(this, "X won", 0).show();
                    return;
                } else if (this.p > 0) {
                    Toast.makeText(this, "O won", 0).show();
                    return;
                } else {
                    Toast.makeText(this, "Draw", 0).show();
                    return;
                }
            }
            return;
        }
        if (this.Ac == 2) {
            this.w1++;
            Button u3 = (Button) findViewById(R.id.play);
            if (this.w1 == 1) {
                u3.setVisibility(0);
            }
            Button b2 = (Button) findViewById(view.getId());
            Button button12 = (Button) findViewById(R.id.button1);
            Button button22 = (Button) findViewById(R.id.button2);
            Button button32 = (Button) findViewById(R.id.button3);
            Button button42 = (Button) findViewById(R.id.button4);
            Button button52 = (Button) findViewById(R.id.button5);
            Button button62 = (Button) findViewById(R.id.button6);
            Button button72 = (Button) findViewById(R.id.button7);
            Button button82 = (Button) findViewById(R.id.button8);
            Button button92 = (Button) findViewById(R.id.button9);
            if (this.q == 0) {
                b2.setText("X");
                this.q++;
                b2.setEnabled(false);
                if (b2 == button12) {
                    this.r[0] = 1;
                    row = 0;
                    col = 0;
                } else if (b2 == button22) {
                    this.r[1] = 1;
                    row = 0;
                    col = 1;
                } else if (b2 == button32) {
                    this.r[2] = 1;
                    row = 0;
                    col = 2;
                } else if (b2 == button42) {
                    this.r[3] = 1;
                    row = 1;
                    col = 0;
                } else if (b2 == button52) {
                    this.r[4] = 1;
                    row = 1;
                    col = 1;
                } else if (b2 == button62) {
                    this.r[5] = 1;
                    row = 1;
                    col = 2;
                } else if (b2 == button72) {
                    this.r[6] = 1;
                    row = 2;
                    col = 0;
                } else if (b2 == button82) {
                    this.r[7] = 1;
                    row = 2;
                    col = 1;
                } else if (b2 != button92) {
                    col = -1;
                    row = -1;
                } else {
                    this.r[8] = 1;
                    row = 2;
                    col = 2;
                }
                u = u3;
                this.e[row][col] = 1;
                if (this.w1 < 9) {
                    int v = robot();
                    switch (v) {
                        case 0:
                            button12.performClick();
                            break;
                        case 1:
                            button22.performClick();
                            break;
                        case 2:
                            button32.performClick();
                            break;
                        case 3:
                            button42.performClick();
                            break;
                        case 4:
                            button52.performClick();
                            break;
                        case 5:
                            button62.performClick();
                            break;
                        case 6:
                            button72.performClick();
                            break;
                        case 7:
                            button82.performClick();
                            break;
                        case 8:
                            button92.performClick();
                            break;
                    }
                }
            } else {
                u = u3;
                b2.setText("O");
                b2.setEnabled(false);
                this.q--;
                int row3 = -1;
                int col3 = -1;
                if (b2 == button12) {
                    this.r[0] = 1;
                    row3 = 0;
                    col3 = 0;
                } else if (b2 == button22) {
                    this.r[1] = 1;
                    row3 = 0;
                    col3 = 1;
                } else if (b2 == button32) {
                    this.r[2] = 1;
                    row3 = 0;
                    col3 = 2;
                } else if (b2 == button42) {
                    this.r[3] = 1;
                    row3 = 1;
                    col3 = 0;
                } else if (b2 == button52) {
                    this.r[4] = 1;
                    row3 = 1;
                    col3 = 1;
                } else if (b2 == button62) {
                    this.r[5] = 1;
                    row3 = 1;
                    col3 = 2;
                } else if (b2 == button72) {
                    this.r[6] = 1;
                    row3 = 2;
                    col3 = 0;
                } else if (b2 == button82) {
                    this.r[7] = 1;
                    row3 = 2;
                    col3 = 1;
                } else if (b2 == button92) {
                    this.r[8] = 1;
                    row3 = 2;
                    col3 = 2;
                }
                this.e[row3][col3] = 0;
            }
            int row4 = this.w1;
            if (row4 == 9) {
                Button u4 = u;
                u4.setText("Play Again");
                int i9 = 0;
                while (true) {
                    if (i9 < 3) {
                        int j3 = 0;
                        for (int i10 = 3; j3 < i10; i10 = 3) {
                            int[] iArr3 = this.g;
                            iArr3[i9] = iArr3[i9] + this.e[i9][j3];
                            j3++;
                            u4 = u4;
                        }
                        i9++;
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < 3) {
                                int j4 = 0;
                                for (int i12 = 3; j4 < i12; i12 = 3) {
                                    int[] iArr4 = this.y;
                                    iArr4[i11] = iArr4[i11] + this.e[j4][i11];
                                    j4++;
                                }
                                i11++;
                            } else {
                                for (int i13 = 0; i13 < 3; i13++) {
                                    if (this.y[i13] == 0) {
                                        i = 1;
                                        this.p++;
                                    } else {
                                        i = 1;
                                    }
                                    if (this.g[i13] == 0) {
                                        this.p += i;
                                    }
                                    if (this.y[i13] == 3) {
                                        this.k += i;
                                    }
                                    if (this.g[i13] == 3) {
                                        this.k += i;
                                    }
                                }
                                int i14 = this.k;
                                if (i14 > 0 && this.p > 0) {
                                    Toast.makeText(this, "Draw", 0).show();
                                    return;
                                }
                                if (this.k > 0) {
                                    Toast.makeText(this, "X won", 0).show();
                                    return;
                                } else if (this.p > 0) {
                                    Toast.makeText(this, "O won", 0).show();
                                    return;
                                } else {
                                    Toast.makeText(this, "Draw", 0).show();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void botf(View view) {
        Button s = (Button) findViewById(R.id.friends);
        Button b = (Button) findViewById(R.id.bot);
        Button d = (Button) findViewById(view.getId());
        if (s == d) {
            s.setEnabled(false);
            this.Ac++;
            b.setEnabled(false);
            s.setBackgroundColor(Color.parseColor("#1D8348"));
            return;
        }
        if (b == d) {
            this.Ac += 2;
            b.setEnabled(false);
            s.setEnabled(false);
            b.setBackgroundColor(Color.parseColor("#1D8348"));
        }
    }

    public int robot() {
        int m;
        Random ra = new Random();
        do {
            m = ra.nextInt(9);
        } while (this.r[m] == 1);
        return m;
    }

    public void play(View view) {
        finish();
        overridePendingTransition(0, 0);
        startActivity(getIntent());
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: com.example.tictactoe.MainActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return MainActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View v, WindowInsetsCompat insets) {
        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        return insets;
    }
}
