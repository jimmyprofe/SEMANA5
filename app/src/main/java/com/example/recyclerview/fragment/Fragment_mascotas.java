package com.example.recyclerview.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.R;
import com.example.recyclerview.adaptador.Adaptadorperros;
import com.example.recyclerview.classVO.perrosVO;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_mascotas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_mascotas extends Fragment {

    RecyclerView rv_mascotas;
    ArrayList<perrosVO> listaperros = new ArrayList<perrosVO>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_mascotas() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_mascotas.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_mascotas newInstance(String param1, String param2) {
        Fragment_mascotas fragment = new Fragment_mascotas();
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

        View vista = inflater.inflate(R.layout.fragment_mascotas, container, false);

        rv_mascotas = (RecyclerView) vista.findViewById(R.id.rv_mascotas);
        // Inflate the layout for this fragment

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_mascotas.setLayoutManager(llm);

        llenarlista();

        Adaptadorperros adaptador = new Adaptadorperros(listaperros, getActivity());
        rv_mascotas.setAdapter(adaptador);

        return vista;
    }

    public void llenarlista (){

        listaperros.add(new perrosVO(R.drawable.perro_1, "Catty", 3));
        listaperros.add(new perrosVO(R.drawable.perro_2, "Ronny", 2));
        listaperros.add(new perrosVO(R.drawable.perro_3, "Pelusa", 5));
        listaperros.add(new perrosVO(R.drawable.perro_4, "GuauGuau", 7));
        listaperros.add(new perrosVO(R.drawable.perro_5, "Coqui", 4));

    }
}