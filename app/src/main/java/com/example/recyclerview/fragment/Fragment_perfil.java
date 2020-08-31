package com.example.recyclerview.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.adaptador.Adaptadorperfil;
import com.example.recyclerview.adaptador.Adaptadorperros;
import com.example.recyclerview.classVO.perrosVO;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_perfil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_perfil extends Fragment {

    RecyclerView rv_mascotas;
    ArrayList<perrosVO> listaperfil = new ArrayList<perrosVO>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_perfil() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_perfil.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_perfil newInstance(String param1, String param2) {
        Fragment_perfil fragment = new Fragment_perfil();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_perfil, container, false);

        rv_mascotas = (RecyclerView) vista.findViewById(R.id.recycler_perfil);
        // Inflate the layout for this fragment

        rv_mascotas.setLayoutManager(new GridLayoutManager(getContext(), 3));


        llenarlista();

        Adaptadorperfil adaptador = new Adaptadorperfil(listaperfil, getActivity());
        rv_mascotas.setAdapter(adaptador);


        return vista;
    }

    public void llenarlista (){

        listaperfil.add(new perrosVO(3));
        listaperfil.add(new perrosVO(7));
        listaperfil.add(new perrosVO(8));
        listaperfil.add(new perrosVO(2));
        listaperfil.add(new perrosVO(5));
        listaperfil.add(new perrosVO(3));
        listaperfil.add(new perrosVO(7));
        listaperfil.add(new perrosVO(8));
        listaperfil.add(new perrosVO(2));


    }


}