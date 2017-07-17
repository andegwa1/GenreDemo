package com.example.al.genredemo.genres.ambient.ambientFragments;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.al.genredemo.R;
import com.example.al.genredemo.genres.ambient.ambientAdapters.AmbientListAdapter;
import com.example.al.genredemo.genres.blues.bluesAdapters.BluesListAdapter;

import java.io.IOException;


public class AmbientAlbumsFragment extends Fragment {




    ListView list;

    public View.OnClickListener startStreamListener1;
    public View.OnClickListener stopStreamListener1;
    private ImageView imageView1;

    static final String BASE = "http://e.snmc.io/lk/f/l/";
    static final String EXT = ".jpg";
    static final String[] imgid = {
            BASE + "09b210abcf3d5c35c4e51f53d7cf10f1/1741067" + EXT,
            "https://e.snmc.io/lk/s/l/bb5b838f0fa10bbf9c3d2b3b9fcc2e24/2622116.jpg",
            "https://e.snmc.io/lk/s/l/09755f420fd099a7a6eddd9c14b58a78/5638287.jpg",
            "https://e.snmc.io/lk/s/l/a79585467d8735f2edcfb465bd7acc62/1576321.jpg",

            "https://e.snmc.io/lk/s/l/92170fac130696c10ce4cd1ab4349e03/1989754.jpg",
            "https://e.snmc.io/lk/s/l/ea0a65be7d3394765562abf236f537d5/5637647.jpg",

            "https://e.snmc.io/lk/s/l/f942e300ceb0068a3c11fd92f46d7463/1995504.jpg",
            "https://e.snmc.io/lk/s/l/f22b57be1283e10ede8ba7be6d64af20/2336117.jpg",

            "https://e.snmc.io/lk/s/l/eeed7fc90b76fc44d9702111c474e8bc/1881335.jpg",
            "https://e.snmc.io/lk/s/l/203d63246ad58952f3a84a26779feeda/4968116.jpg"
    };

    String[] itemname ={
            "Akira Yamaoka",
            "Aphex Twin",
            "Stars of the Lid",
            "Brian Eno",

            "Tim Hecker",
            "Stars of the Lid",
            "Gas",
            "Steve Roach",
            "Bohren & der CLub of Gore",
            "Brian Eno with Daniel Lanois & Roger Eno"
    };

    String[] albumname = {
            "Silent Hill 2: Original Soundtrack (2001)",
            "Selected Ambient Works Volume II (1994)",
            "Tired Sounds of (2001)",
            "Ambient 1: Music for Airports (1978)",

            "Harmony in Ultraviolet (2006)",
            "And Their Refinement of the Decline (2007)",
            "Pop (2000)",
            "Structures From Silence (1984)",
            "Black Earth (2002)",
            "Apollo: Atmospheres & Soundtracks (1983)"
    };

    String[] genrename = {
            "Video Game Music, Ambient",
            "Ambient, Electronic",
            "Ambient, Drone",
            "Ambient",

            "Ambient",
            "Ambient, Drone",
            "Ambient",
            "Space Ambient, Ambient",
            "Dark Jazz, Dark Ambient",
            "Space Ambient, Ambient, Soundtracks"

    };


    public AmbientAlbumsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ambient_albums, container, false);

        AmbientListAdapter adapter = new AmbientListAdapter(getActivity(), itemname, imgid, albumname,
                genrename);
        list=(ListView)view.findViewById(R.id.ambient_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(getActivity(),"Akira Yamaoka - Promise (Reprise)",
                                Toast.LENGTH_SHORT).show();
                        /*
                        String url1 = "https://p.scdn.co/mp3-preview/d30c12959ffeda51d7fe76672441fa" +
                                "cb97e6153c?cid=88" +
                                "97482848704f2a8f8d7c79726a70d4";
                        final MediaPlayer mediaPlayer1 = new MediaPlayer();
                        mediaPlayer1.setAudioStreamType(AudioManager.STREAM_MUSIC);
                        try {
                            mediaPlayer1.setDataSource(url1);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            mediaPlayer1.prepare(); // might take long! (for buffering, etc)
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        startStreamListener1 = new View.OnClickListener(){
                            public void onClick(View v) {
                                Toast.makeText(getActivity(),"Akira Yamaoka - Promise (Reprise)",
                                        Toast.LENGTH_SHORT).show();
                                mediaPlayer1.start();
                                //list..setOnClickListener(stopStreamListener1);
                            }
                        };

                        */


//                        stopStreamListener1 = new View.OnClickListener(){
//                            public void onClick(View v) {
//                                mediaPlayer1.pause();
//                                imageView1.setOnClickListener(startStreamListener1);
//                            }
//                        };
//                        imageView1.setOnClickListener(startStreamListener1);
                        break;
                    default:
                }
            }
        });

        // Inflate the layout for this fragment
        return view;
    }


}









    /*

    private Context context;


    private View.OnClickListener startStreamListener1;
    private View.OnClickListener stopStreamListener1;
    private ImageView imageView1;

    private View.OnClickListener startStreamListener2;
    private View.OnClickListener stopStreamListener2;
    private ImageView imageView2;

    private View.OnClickListener startStreamListener3;
    private View.OnClickListener stopStreamListener3;
    private ImageView imageView3;

    private View.OnClickListener startStreamListener4;
    private View.OnClickListener stopStreamListener4;
    private ImageView imageView4;

    private View.OnClickListener startStreamListener5;
    private View.OnClickListener stopStreamListener5;
    private ImageView imageView5;

    private View.OnClickListener startStreamListener6;
    private View.OnClickListener stopStreamListener6;
    private ImageView imageView6;

    private View.OnClickListener startStreamListener7;
    private View.OnClickListener stopStreamListener7;
    private ImageView imageView7;

    private View.OnClickListener startStreamListener8;
    private View.OnClickListener stopStreamListener8;
    private ImageView imageView8;

    private View.OnClickListener startStreamListener9;
    private View.OnClickListener stopStreamListener9;
    private ImageView imageView9;

    private View.OnClickListener startStreamListener10;
    private View.OnClickListener stopStreamListener10;
    private ImageView imageView10;


    public AmbientAlbumsFragment() {
        // Required empty public constructor
        context = getContext();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        ImageView imageView = (ImageView) view.findViewById(R.id.ambient_akira);
//        Picasso.with(context).load("https://e.snmc.io/lk/s/l/a075f0aa3c11bf9f18e0db4cc9cb6f9b/1741067.jpg")
//                .into(imageView);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ambient_albums, container, false);


        //1. Akira
        imageView1 = (ImageView)view.findViewById(R.id.ambient_akira);
        String url1 = "https://p.scdn.co/mp3-preview/d30c12959ffeda51d7fe76672441facb97e6153c?cid=88" +
                "97482848704f2a8f8d7c79726a70d4";
        final MediaPlayer mediaPlayer1 = new MediaPlayer();
        mediaPlayer1.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer1.setDataSource(url1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer1.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        startStreamListener1 = new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Akira Yamaoka - Promise (Reprise)", Toast.LENGTH_SHORT).show();
                mediaPlayer1.start();
                imageView1.setOnClickListener(stopStreamListener1);
            }
        };

        stopStreamListener1 = new View.OnClickListener(){
            public void onClick(View v) {
                mediaPlayer1.pause();
                imageView1.setOnClickListener(startStreamListener1);
            }
        };
        imageView1.setOnClickListener(startStreamListener1);



        //2
        imageView2 = (ImageView)view.findViewById(R.id.ambient_aphex);
        String url2 = "https://p.scdn.co/mp3-preview/768515ec51df38f5ce5fb8bfb2a39827a9d35c39?cid=88" +
                "97482848704f2a8f8d7c79726a70d4";
        final MediaPlayer mediaPlayer2 = new MediaPlayer();
        mediaPlayer2.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer2.setDataSource(url2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer2.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        startStreamListener2 = new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Aphex Twin - untitled 1.2", Toast.LENGTH_SHORT).show();
                mediaPlayer2.start();
                imageView2.setOnClickListener(stopStreamListener2);
            }
        };

        stopStreamListener2 = new View.OnClickListener(){
            public void onClick(View v) {
                mediaPlayer2.pause();
                imageView2.setOnClickListener(startStreamListener2);
            }
        };
        imageView2.setOnClickListener(startStreamListener2);


        //3
        imageView3 = (ImageView)view.findViewById(R.id.ambient_sotl1);
        String url3 = "https://p.scdn.co/mp3-preview/16e50474d176bec6288c6c0be2b96d4e4e57f8ee?cid=88" +
                "97482848704f2a8f8d7c79726a70d4";
        final MediaPlayer mediaPlayer3 = new MediaPlayer();
        mediaPlayer3.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer3.setDataSource(url3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer3.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        startStreamListener3 = new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Stars of the Lid - Requiem for Dying Mothers, Part 2", Toast.LENGTH_SHORT).show();
                mediaPlayer3.start();
                imageView3.setOnClickListener(stopStreamListener3);
            }
        };

        stopStreamListener3 = new View.OnClickListener(){
            public void onClick(View v) {
                mediaPlayer3.pause();
                imageView3.setOnClickListener(startStreamListener3);
            }
        };
        imageView3.setOnClickListener(startStreamListener3);

        //4
        imageView4 = (ImageView)view.findViewById(R.id.ambient_eno);
        String url4 = "https://p.scdn.co/mp3-preview/b7cd7208aa6c68607b492c5298234cbe8b86c39d?cid=88" +
                "97482848704f2a8f8d7c79726a70d4";
        final MediaPlayer mediaPlayer4 = new MediaPlayer();
        mediaPlayer4.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer4.setDataSource(url4);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer4.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        startStreamListener4 = new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Brian Eno - 1/1", Toast.LENGTH_SHORT).show();
                mediaPlayer4.start();
                imageView4.setOnClickListener(stopStreamListener4);
            }
        };

        stopStreamListener4 = new View.OnClickListener(){
            public void onClick(View v) {
                mediaPlayer4.pause();
                imageView4.setOnClickListener(startStreamListener4);
            }
        };
        imageView4.setOnClickListener(startStreamListener4);



        //5
        imageView5 = (ImageView)view.findViewById(R.id.ambient_hecker);
        String url5 = "https://p.scdn.co/mp3-preview/e7a3bcd08adca7495b19c080cb1e286cf17b6c9f?cid=8" +
                "897482848704f2a8f8d7c79726a70d4";
        final MediaPlayer mediaPlayer5 = new MediaPlayer();
        mediaPlayer5.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer5.setDataSource(url5);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer5.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        startStreamListener5 = new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Tim Hecker - Chimeras", Toast.LENGTH_SHORT).show();
                mediaPlayer5.start();
                imageView5.setOnClickListener(stopStreamListener5);
            }
        };

        stopStreamListener5 = new View.OnClickListener(){
            public void onClick(View v) {
                mediaPlayer5.pause();
                imageView5.setOnClickListener(startStreamListener5);
            }
        };
        imageView5.setOnClickListener(startStreamListener5);


        //6
        imageView6 = (ImageView)view.findViewById(R.id.ambient_sotl2);
        String url6 = "https://p.scdn.co/mp3-preview/9d75fac6e9a537a087c6a36215a7501738c5f938?cid=88" +
                "97482848704f2a8f8d7c79726a70d4";
        final MediaPlayer mediaPlayer6 = new MediaPlayer();
        mediaPlayer6.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer6.setDataSource(url6);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer6.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        startStreamListener6 = new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Stars of the Lid - Dungtitled", Toast.LENGTH_SHORT).show();
                mediaPlayer6.start();
                imageView6.setOnClickListener(stopStreamListener6);
            }
        };

        stopStreamListener6 = new View.OnClickListener(){
            public void onClick(View v) {
                mediaPlayer6.pause();
                imageView6.setOnClickListener(startStreamListener6);
            }
        };
        imageView6.setOnClickListener(startStreamListener6);


        //7
        imageView7 = (ImageView)view.findViewById(R.id.ambient_gas);
        String url7 = "https://p.scdn.co/mp3-preview/e3436df14b11a86a601946d599f8d06a8a5c9bbb?cid=88" +
                "97482848704f2a8f8d7c79726a70d4";
        final MediaPlayer mediaPlayer7 = new MediaPlayer();
        mediaPlayer7.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer7.setDataSource(url7);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer7.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        startStreamListener7 = new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Gas - Pop 1", Toast.LENGTH_SHORT).show();
                mediaPlayer7.start();
                imageView7.setOnClickListener(stopStreamListener7);
            }
        };

        stopStreamListener7 = new View.OnClickListener(){
            public void onClick(View v) {
                mediaPlayer7.pause();
                imageView7.setOnClickListener(startStreamListener7);
            }
        };
        imageView7.setOnClickListener(startStreamListener7);


        //8
        imageView8 = (ImageView)view.findViewById(R.id.roach);
        String url8 = "https://p.scdn.co/mp3-preview/21ee77b190c601b28320332e6c2b82264c386f8a?cid=88" +
                "97482848704f2a8f8d7c79726a70d4";
        final MediaPlayer mediaPlayer8 = new MediaPlayer();
        mediaPlayer8.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer8.setDataSource(url8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer8.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        startStreamListener8 = new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Steve Roach - Structures from Silence", Toast.LENGTH_SHORT).show();
                mediaPlayer8.start();
                imageView8.setOnClickListener(stopStreamListener8);
            }
        };

        stopStreamListener8 = new View.OnClickListener(){
            public void onClick(View v) {
                mediaPlayer8.pause();
                imageView1.setOnClickListener(startStreamListener8);
            }
        };
        imageView8.setOnClickListener(startStreamListener8);


        //9
        imageView9 = (ImageView)view.findViewById(R.id.bohren);
        String url9 = "https://p.scdn.co/mp3-preview/53baae01c07d78fc925813dc8ee110b121ee5b90?cid=8" +
                "897482848704f2a8f8d7c79726a70d4";
        final MediaPlayer mediaPlayer9 = new MediaPlayer();
        mediaPlayer9.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer9.setDataSource(url9);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer9.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        startStreamListener9 = new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Bohren & der Club of Gore - Maximum Black", Toast.LENGTH_SHORT).show();
                mediaPlayer9.start();
                imageView9.setOnClickListener(stopStreamListener9);
            }
        };

        stopStreamListener9 = new View.OnClickListener(){
            public void onClick(View v) {
                mediaPlayer9.pause();
                imageView9.setOnClickListener(startStreamListener9);
            }
        };
        imageView9.setOnClickListener(startStreamListener9);


        //10
        imageView10 = (ImageView)view.findViewById(R.id.ambient_bios);
        String url10 = "https://p.scdn.co/mp3-preview/ebaa006882d78776ef8d27b12756bbf07ac9ee55?cid=8" +
                "897482848704f2a8f8d7c79726a70d4";
        final MediaPlayer mediaPlayer10 = new MediaPlayer();
        mediaPlayer10.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer10.setDataSource(url10);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer10.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }

        startStreamListener10 = new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Biosphere - Poa Alpina", Toast.LENGTH_SHORT).show();
                mediaPlayer10.start();
                imageView10.setOnClickListener(stopStreamListener10);
            }
        };

        stopStreamListener10 = new View.OnClickListener(){
            public void onClick(View v) {
                mediaPlayer10.pause();
                imageView10.setOnClickListener(startStreamListener10);
            }
        };
        imageView10.setOnClickListener(startStreamListener10);




      return view;
    }

*/



    //}


