package com.kubrin.loftmoney;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kubrin.loftmoney.cells.MoneyCellAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView itemsView;

    private MoneyCellAdapter moneyCellAdapter = new MoneyCellAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout fragment = findViewById(R.id.frame);

        Fragment frag2 = new BudgetFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.frame, frag2).commit();


        /*findViewById(R.id.itemsView);
        configureRecyclerView();
        generateMoney();*/
    }

    private void generateMoney() {
       /* List<MoneyItem> moneyItems = new ArrayList<>();
        moneyItems.add(new MoneyItem("PS5", "30000"));
        moneyItems.add(new MoneyItem("Salary", "50000Р"));

        moneyCellAdapter.setData(moneyItems);*/


    }

    private void configureRecyclerView() {

        /*itemsView = findViewById(R.id.itemsView);
        itemsView.setAdapter(moneyCellAdapter);

        MoneyCellAdapter.moneyCellAdapterClick = new MoneyCellAdapterClick() {
            @Override
            public void oneCellClick(MoneyItem moneyItem) {
                Toast.makeText(getApplicationContext(), "Cell clicked" + moneyItem.getValue(), Toast.LENGTH_LONG).show();

            }

            @Override
            public void onTitleClick() {
                Toast.makeText(getApplicationContext(), "Title clicked", Toast.LENGTH_LONG).show();

            }
        };

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),
               LinearLayoutManager.VERTICAL, false);
        itemsView.setLayoutManager(layoutManager);

    }*/
    }
}