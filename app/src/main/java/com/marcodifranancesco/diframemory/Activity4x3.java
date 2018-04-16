package com.marcodifranancesco.diframemory;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class Activity4x3 extends AppCompatActivity {
    TextView textView;
    ImageView imageView11, imageView12, imageView13, imageView14,
            imageView21, imageView22, imageView23, imageView24,
            imageView31, imageView32, imageView33, imageView34;
    Integer[] cardsArray = {11, 12, 13, 14, 15, 16, 21, 22, 23, 24, 25, 26};

    MediaPlayer correct, incorrect, base;

    int image011, image012, image013, image014, image015, image016,
            image021, image022, image023, image024, image025, image026;
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;
    int points = 0;
    int backgroundImage[] = {R.drawable.arancione1, R.drawable.rosso1, R.drawable.verde1};
    int counterTentativi = 0;
    long startTime = 0;
    int timerCounter = 0;

    TextView textViewTimer, textViewTentativi;
    Handler timerHandler = new Handler();
    Runnable timerRunnable = new Runnable() {
        public void run() {
            long millis = System.currentTimeMillis() - startTime;
            int seconds = (int) (millis / 1000);
            int minutes = seconds / 60;

            seconds = seconds % 60;
            textViewTimer.setText(String.format("%02d:%02d", minutes, seconds));
            timerHandler.postDelayed(this, 30);
        }
    };


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4x3);
        textView = (TextView) findViewById(R.id.textView);
        textViewTimer = (TextView) findViewById(R.id.textViewTimer);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView31 = (ImageView) findViewById(R.id.imageView31);
        imageView32 = (ImageView) findViewById(R.id.imageView32);
        imageView33 = (ImageView) findViewById(R.id.imageView33);
        imageView34 = (ImageView) findViewById(R.id.imageView34);

        imageView11.setTag("0");
        imageView12.setTag("1");
        imageView13.setTag("2");
        imageView14.setTag("3");
        imageView21.setTag("4");
        imageView22.setTag("5");
        imageView23.setTag("6");
        imageView24.setTag("7");
        imageView31.setTag("8");
        imageView32.setTag("9");
        imageView33.setTag("10");
        imageView34.setTag("11");

        correct = MediaPlayer.create(getApplicationContext(), R.raw.correct);
        incorrect = MediaPlayer.create(getApplicationContext(), R.raw.incorrect);
        base = MediaPlayer.create(getApplicationContext(), R.raw.base);

        frontOfCardsResources(); // Carica le immagini
        Collections.shuffle(Arrays.asList(cardsArray)); // Mescola carte
        textView.setTextColor(Color.BLACK);
        textViewTentativi = (TextView) findViewById(R.id.textViewTentativi);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.background);
        relativeLayout.setBackgroundResource(backgroundImage[0]);

        base.start();

        imageView11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView11, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView12, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView13, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView14, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView21, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView22, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView23, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView24, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView31, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView32, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView33, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
        imageView34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(imageView34, theCard);
                if (timerCounter == 0) {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    timerCounter++;
                }
            }
        });
    }
    protected void onPause(){
        super.onPause();
        base.stop();
    }

    protected void onResume(){
        super.onResume();
    }

    protected void onDestroy(){
        super.onDestroy();
    }


    public void doStuff(ImageView imageView, int card) {
        if (cardsArray[card] == 11) {
            imageView.setImageResource(image011);
        } else if (cardsArray[card] == 12) {
            imageView.setImageResource(image012);
        } else if (cardsArray[card] == 13) {
            imageView.setImageResource(image013);
        } else if (cardsArray[card] == 14) {
            imageView.setImageResource(image014);
        } else if (cardsArray[card] == 15) {
            imageView.setImageResource(image015);
        } else if (cardsArray[card] == 16) {
            imageView.setImageResource(image016);
        } else if (cardsArray[card] == 21) {
            imageView.setImageResource(image021);
        } else if (cardsArray[card] == 22) {
            imageView.setImageResource(image022);
        } else if (cardsArray[card] == 23) {
            imageView.setImageResource(image023);
        } else if (cardsArray[card] == 24) {
            imageView.setImageResource(image024);
        } else if (cardsArray[card] == 25) {
            imageView.setImageResource(image025);
        } else if (cardsArray[card] == 26) {
            imageView.setImageResource(image026);
        }

        if (cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 20) {
                firstCard = firstCard - 10;
            }
            cardNumber = 2;
            clickedFirst = card;
            imageView.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = cardsArray[card];
            if (secondCard > 20) {
                secondCard = secondCard - 10;
            }
            cardNumber = 1;
            clickedSecond = card;

            imageView11.setEnabled(false);
            imageView12.setEnabled(false);
            imageView13.setEnabled(false);
            imageView14.setEnabled(false);
            imageView21.setEnabled(false);
            imageView22.setEnabled(false);
            imageView23.setEnabled(false);
            imageView24.setEnabled(false);
            imageView31.setEnabled(false);
            imageView32.setEnabled(false);
            imageView33.setEnabled(false);
            imageView34.setEnabled(false);

            if (firstCard == secondCard) {
                //    sameClicked();
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.background);
                relativeLayout.setBackgroundResource(backgroundImage[2]);
                correct.start();
            } else{
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.background);
                relativeLayout.setBackgroundResource(backgroundImage[1]);
                incorrect.start();
            }

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    sameCard();
                }
            }, 1000);
        }
    }

    public void sameCard() {
        counterTentativi++;
        textViewTentativi.setText(counterTentativi + " ");
        if (firstCard == secondCard) {
            sameClicked();
            points++;
            textView.setText("Punti: " + points);
        } else {
            imageView11.setImageResource(R.drawable.xx);
            imageView12.setImageResource(R.drawable.xx);
            imageView13.setImageResource(R.drawable.xx);
            imageView14.setImageResource(R.drawable.xx);
            imageView21.setImageResource(R.drawable.xx);
            imageView22.setImageResource(R.drawable.xx);
            imageView23.setImageResource(R.drawable.xx);
            imageView24.setImageResource(R.drawable.xx);
            imageView31.setImageResource(R.drawable.xx);
            imageView32.setImageResource(R.drawable.xx);
            imageView33.setImageResource(R.drawable.xx);
            imageView34.setImageResource(R.drawable.xx);
        }
        imageView11.setEnabled(true);
        imageView12.setEnabled(true);
        imageView13.setEnabled(true);
        imageView14.setEnabled(true);
        imageView21.setEnabled(true);
        imageView22.setEnabled(true);
        imageView23.setEnabled(true);
        imageView24.setEnabled(true);
        imageView31.setEnabled(true);
        imageView32.setEnabled(true);
        imageView33.setEnabled(true);
        imageView34.setEnabled(true);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.background);
        relativeLayout.setBackgroundResource(backgroundImage[0]);
        checkEnd();
    }

    public void sameClicked(){
        if (clickedFirst == 0) {
            imageView11.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 1) {
            imageView12.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 2) {
            imageView13.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 3) {
            imageView14.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 4) {
            imageView21.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 5) {
            imageView22.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 6) {
            imageView23.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 7) {
            imageView24.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 8) {
            imageView31.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 9) {
            imageView32.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 10) {
            imageView33.setVisibility(View.INVISIBLE);
        } else if (clickedFirst == 11) {
            imageView34.setVisibility(View.INVISIBLE);
        }

        if (clickedSecond == 0) {
            imageView11.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 1) {
            imageView12.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 2) {
            imageView13.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 3) {
            imageView14.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 4) {
            imageView21.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 5) {
            imageView22.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 6) {
            imageView23.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 7) {
            imageView24.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 8) {
            imageView31.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 9) {
            imageView32.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 10) {
            imageView33.setVisibility(View.INVISIBLE);
        } else if (clickedSecond == 11) {
            imageView34.setVisibility(View.INVISIBLE);
        }
    }

    public void checkEnd() {
        if (imageView11.getVisibility() == View.INVISIBLE &&
                imageView12.getVisibility() == View.INVISIBLE &&
                imageView13.getVisibility() == View.INVISIBLE &&
                imageView14.getVisibility() == View.INVISIBLE &&
                imageView21.getVisibility() == View.INVISIBLE &&
                imageView22.getVisibility() == View.INVISIBLE &&
                imageView23.getVisibility() == View.INVISIBLE &&
                imageView24.getVisibility() == View.INVISIBLE &&
                imageView31.getVisibility() == View.INVISIBLE &&
                imageView32.getVisibility() == View.INVISIBLE &&
                imageView33.getVisibility() == View.INVISIBLE &&
                imageView34.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alerDialogBuilder = new AlertDialog.Builder(Activity4x3.this);
            alerDialogBuilder
                    .setMessage("Gioco finito in "+ textViewTimer.getText() + "!!!\nHai concluso scoprendo le " + points + " coppie in " + counterTentativi + " tentativi" + "\nCosa vuoi fare?")
                    .setCancelable(false)
                    .setNeutralButton("Menu", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setPositiveButton("Gioca ancora", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), Activity4x3.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Next", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), Activity4x5.class);
                            startActivity(intent);
                        }
                    });
            AlertDialog alertDialog = alerDialogBuilder.create();
            alertDialog.show();
            timerHandler.removeCallbacks(timerRunnable);
            base.stop();
        }
    }

    private void frontOfCardsResources() {
        image011 = R.drawable.a1;
        image012 = R.drawable.a2;
        image013 = R.drawable.a3;
        image014 = R.drawable.a4;
        image015 = R.drawable.a5;
        image016 = R.drawable.a6;
        image021 = R.drawable.b1;
        image022 = R.drawable.b2;
        image023 = R.drawable.b3;
        image024 = R.drawable.b4;
        image025 = R.drawable.b5;
        image026 = R.drawable.b6;
    }
}
