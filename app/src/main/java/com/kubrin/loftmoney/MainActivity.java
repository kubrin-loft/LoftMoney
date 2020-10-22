package com.kubrin.loftmoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.kubrin.loftmoney.cells.MoneyCellAdapter;
import com.kubrin.loftmoney.cells.MoneyCellAdapterClick;
import com.kubrin.loftmoney.cells.MoneyItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView itemsView;

    private MoneyCellAdapter moneyCellAdapter = new MoneyCellAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureRecyclerView();

        generateMoney();
    }
    private void generateMoney(){
        List<MoneyItem> moneyItems = new ArrayList<>();
        moneyItems.add(new MoneyItem("PS5", "30000"));
        moneyItems.add(new MoneyItem("Salary", "50000Р"));

        moneyCellAdapter.setData(moneyItems);


    }
    private  void configureRecyclerView() {
        itemsView = findViewById(R.id.itemsView);
        itemsView.setAdapter(moneyCellAdapter);

        moneyCellAdapter.moneyCellAdapterClick = new MoneyCellAdapterClick() {
            @Override
            public void oneCellClick(MoneyItem moneyItem) {
                Toast.makeText(getApplicationContext(), "Cell clicked" + moneyItem.getValue(), Toast.LENGTH_LONG).show();

            }

            @Override
            public void onTitleClick() {
                Toast.makeText(getApplicationContext(), "Title clicked!", Toast.LENGTH_LONG).show();

            }
        };

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),
               LinearLayoutManager.VERTICAL, false);
        itemsView.setLayoutManager(layoutManager);

    }
}