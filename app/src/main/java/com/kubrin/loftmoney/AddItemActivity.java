package com.kubrin.loftmoney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddItemActivity extends AppCompatActivity {

    EditText name;
    EditText price;
    Button addButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        name = findViewById(R.id.et_name);
        price = findViewById(R.id.et_price);
        addButton = findViewById(R.id.add_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtName = name.getText().toString();
                String txtPrice = price.getText().toString();
                if (txtName != ""  && txtPrice != "") {
                    Intent intent = new Intent();
                    intent.putExtra(BudgetFragment.EXTRA_NAME, txtName);
                    intent.putExtra(BudgetFragment.EXTRA_PRICE, txtPrice);
                    setResult(0, intent);
                    finish();
                }
            }
        });

    }

}