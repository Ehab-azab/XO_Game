package com.example.xo_game;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter=1;
    public int PlayerX = 0;
    int playerO = 0;
    TextView player1tv,player2tv;
    ImageView refresh_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1tv=findViewById(R.id.player1);
        player2tv=findViewById(R.id.player2);
        player1tv.setText("player X is : "+PlayerX);
        player2tv.setText("player O is : "+playerO);
        refresh_image=findViewById(R.id.refreshbtn);
        refresh_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final TextView b1= ((TextView) findViewById(R.id.et_1));
                final TextView b2= ((TextView) findViewById(R.id.et_2));
                final TextView b3= ((TextView) findViewById(R.id.et_3));
                final TextView b4= ((TextView) findViewById(R.id.et_4));
                final TextView b5= ((TextView) findViewById(R.id.et_5));
                final TextView b6= ((TextView) findViewById(R.id.et_6));
                final TextView b7= ((TextView) findViewById(R.id.et_7));
                final TextView b8= ((TextView) findViewById(R.id.et_8));
                final TextView b9= ((TextView) findViewById(R.id.et_9));
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                PlayerX=0;
                playerO=0;
                player1tv.setText("player X is : "+PlayerX);
                player2tv.setText("player O is : "+playerO);
            }
        });

    }

    public void xoclick(View view) {
        TextView xobuttons = ((TextView) view);
        final TextView b1= ((TextView) findViewById(R.id.et_1));
        final TextView b2= ((TextView) findViewById(R.id.et_2));
        final TextView b3= ((TextView) findViewById(R.id.et_3));
        final TextView b4= ((TextView) findViewById(R.id.et_4));
        final TextView b5= ((TextView) findViewById(R.id.et_5));
        final TextView b6= ((TextView) findViewById(R.id.et_6));
        final TextView b7= ((TextView) findViewById(R.id.et_7));
        final TextView b8= ((TextView) findViewById(R.id.et_8));
        final TextView b9= ((TextView) findViewById(R.id.et_9));



        if (counter<=9&&counter%2!=0&&xobuttons.getText().toString().equals("")){
                xobuttons.setTextColor(getResources().getColor(R.color.black));
                xobuttons.setText("X");
                if((b1.getText().toString().equals("X")&&b4.getText().toString().equals("X")&&b7.getText().toString().equals("X"))
                        ||(b2.getText().toString().equals("X")&&b5.getText().toString().equals("X")&&b8.getText().toString().equals("X"))
                        ||(b9.getText().toString().equals("X")&&b6.getText().toString().equals("X")&&b3.getText().toString().equals("X"))
                        ||(b7.getText().toString().equals("X")&&b8.getText().toString().equals("X")&&b9.getText().toString().equals("X"))
                        ||(b4.getText().toString().equals("X")&&b5.getText().toString().equals("X")&&b6.getText().toString().equals("X"))
                        ||(b1.getText().toString().equals("X")&&b2.getText().toString().equals("X")&&b3.getText().toString().equals("X"))
                        ||(b7.getText().toString().equals("X")&&b5.getText().toString().equals("X")&&b3.getText().toString().equals("X"))
                        ||(b1.getText().toString().equals("X")&&b5.getText().toString().equals("X")&&b9.getText().toString().equals("X"))){
                    this.PlayerX+=3;
                    new AlertDialog.Builder(this)
                            .setTitle("Congratulation")
                            .setMessage("Winner is X")
                            .setCancelable(false)
                            .setNegativeButton("back", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    b1.setText("");
                                    b2.setText("");
                                    b3.setText("");
                                    b4.setText("");
                                    b5.setText("");
                                    b6.setText("");
                                    b7.setText("");
                                    b8.setText("");
                                    b9.setText("");
                                    player1tv.setText("player X is : "+PlayerX);
                                    counter=1;
                                }
                            })
                            .create().show();
                }

                counter++;
            }else if (counter<=9&&counter%2==0&&xobuttons.getText().toString().equals("")){
                xobuttons.setTextColor(getResources().getColor(R.color.red));
                xobuttons.setText("O");
            if((b1.getText().toString().equals("O")&&b4.getText().toString().equals("O")&&b7.getText().toString().equals("O"))
                    ||(b2.getText().toString().equals("O")&&b5.getText().toString().equals("O")&&b8.getText().toString().equals("O"))
                    ||(b9.getText().toString().equals("O")&&b6.getText().toString().equals("O")&&b3.getText().toString().equals("O"))
                    ||(b7.getText().toString().equals("O")&&b8.getText().toString().equals("O")&&b9.getText().toString().equals("O"))
                    ||(b4.getText().toString().equals("O")&&b5.getText().toString().equals("O")&&b6.getText().toString().equals("O"))
                    ||(b1.getText().toString().equals("O")&&b2.getText().toString().equals("O")&&b3.getText().toString().equals("O"))
                    ||(b7.getText().toString().equals("O")&&b5.getText().toString().equals("O")&&b3.getText().toString().equals("O"))
                    ||(b1.getText().toString().equals("O")&&b5.getText().toString().equals("O")&&b9.getText().toString().equals("O"))){
                this.playerO+=3;
                new AlertDialog.Builder(this)
                        .setTitle("Congratulation")
                        .setMessage("Winner is O")
                        .setCancelable(false)
                        .setNegativeButton("back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                b1.setText("");
                                b2.setText("");
                                b3.setText("");
                                b4.setText("");
                                b5.setText("");
                                b6.setText("");
                                b7.setText("");
                                b8.setText("");
                                b9.setText("");
                                player2tv.setText("player O is : "+playerO);
                                counter=0;
                            }
                        })
                        .create().show();
            }
                counter++;
            }else if ((b1.getText().toString().contains("X")||b1.getText().toString().contains("O"))
        &&(b2.getText().toString().contains("X")||b2.getText().toString().contains("O"))
        &&(b3.getText().toString().contains("X")||b3.getText().toString().contains("O"))
        &&(b4.getText().toString().contains("X")||b4.getText().toString().contains("O"))
        &&(b5.getText().toString().contains("X")||b5.getText().toString().contains("O"))
        &&(b6.getText().toString().contains("X")||b6.getText().toString().contains("O"))
        &&(b7.getText().toString().contains("X")||b7.getText().toString().contains("O"))
        &&(b8.getText().toString().contains("X")||b8.getText().toString().contains("O"))
        &&(b9.getText().toString().contains("X")||b9.getText().toString().contains("O"))){
            new AlertDialog.Builder(this)
                    .setTitle("Drow")
                    .setMessage("Drowww")
                    .setCancelable(false)
                    .setNegativeButton("back", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            PlayerX+=1;
                            playerO+=1;
                            player1tv.setText("player X is : "+PlayerX);
                            player2tv.setText("player O is : "+playerO);
                            counter=0;
                        }
                    })
                    .create().show();

        }

        }


}

