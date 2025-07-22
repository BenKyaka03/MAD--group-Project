package com.example.investmentshapshot.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.investmentshapshot.model.AssetEntity

@Dao
interface AssetDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAsset(asset: AssetEntity)

    @Query("SELECT * FROM assets ORDER BY id DESC")
    fun getAllAssets(): LiveData<List<AssetEntity>>

    @Delete
    suspend fun deleteAsset(asset: AssetEntity)

    @Query("DELETE FROM assets")
    suspend fun clearAllAssets()
}
