package com.example.investmentsnapshot

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.investmentshapshot.MainActivity
import com.example.investmentshapshot.R

class AddAssetActivity : AppCompatActivity() {

    private lateinit var etAssetName: EditText
    private lateinit var etAmount: EditText
    private lateinit var spinnerAssetType: Spinner
    private lateinit var spinnerRiskLevel: Spinner
    private lateinit var btnSave: Button
    private lateinit var btnBack: Button

    private val assetTypes = listOf("Land", "SACCO", "Shares", "REITs", "Other")
    private val riskLevels = listOf("Low", "Medium", "High")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_asset)

        // Bind views
        etAssetName = findViewById(R.id.etAssetName)
        etAmount = findViewById(R.id.etAmount)
        spinnerAssetType = findViewById(R.id.spinnerAssetType)
        spinnerRiskLevel = findViewById(R.id.spinnerRiskLevel)
        btnSave = findViewById(R.id.btnSave)
        btnBack = findViewById(R.id.btnBack)

        // Populate Spinners
        spinnerAssetType.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, assetTypes)
        spinnerRiskLevel.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, riskLevels)

        // Save action
        btnSave.setOnClickListener {
            val name = etAssetName.text.toString().trim()
            val amountText = etAmount.text.toString().trim()
            val assetType = spinnerAssetType.selectedItem.toString()
            val riskLevel = spinnerRiskLevel.selectedItem.toString()

            if (name.isEmpty() || amountText.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val amount = amountText.toDoubleOrNull()
            if (amount == null || amount <= 0) {
                Toast.makeText(this, "Enter a valid amount", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // TODO: Save to Room database here

            Toast.makeText(
                this,
                "Saved: $name ($assetType) - KES $amount, Risk: $riskLevel",
                Toast.LENGTH_LONG
            ).show()

            clearForm()
        }

        // Go back
        btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun clearForm() {
        etAssetName.text.clear()
        etAmount.text.clear()
        spinnerAssetType.setSelection(0)
        spinnerRiskLevel.setSelection(0)
    }
}
