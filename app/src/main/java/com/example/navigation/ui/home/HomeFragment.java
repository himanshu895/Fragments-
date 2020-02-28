package com.example.navigation.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.navigation.Main2Activity;
import com.example.navigation.Main3Activity;
import com.example.navigation.MainActivity;
import com.example.navigation.R;
import com.example.navigation.ui.dashboard.DashboardFragment;

public class HomeFragment extends Fragment {
Button bt;
    EditText e1,e2,e3,e4,e5;
    String name,reg,ab,bc,cd;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        bt=(Button)view.findViewById(R.id.button2);
        e1=(EditText)view.findViewById(R.id.editText2);
        e2=(EditText)view.findViewById(R.id.editText3);
        e3=(EditText)view.findViewById(R.id.editText4);
        e4=(EditText)view.findViewById(R.id.editText5);
        e5=(EditText)view.findViewById(R.id.editText6);
      //  final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
             //   textView.setText(s);
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=e1.getText().toString();
                reg=e2.getText().toString();
                ab=e3.getText().toString();
                bc=e4.getText().toString();
                cd=e5.getText().toString();
                Toast.makeText(getActivity(),"Submit Successfully",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Main3Activity.class);
                intent.putExtra("name_key", name);
                intent.putExtra("reg_key", reg);
                intent.putExtra("ab_key", ab);
                intent.putExtra("bc_key", bc);
                intent.putExtra("cd_key", cd);

                startActivity(intent);
            }
        });
        return view;
    }
}