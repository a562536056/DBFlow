package com.raizlabs.android.dbflow.test.structure

import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.ManyToMany
import com.raizlabs.android.dbflow.annotation.MultipleManyToMany
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.structure.BaseModel
import com.raizlabs.android.dbflow.test.TestDatabase

/**
 * Description: Tests code gen on many to many.
 */
@Table(database = TestDatabase::class)
@ManyToMany(referencedTable = TestModel1::class)
@MultipleManyToMany(ManyToMany(referencedTable = TestModel2::class), ManyToMany(referencedTable = com.raizlabs.android.dbflow.test.sql.TestModel3::class))
class ManyToManyModel : BaseModel() {

    @PrimaryKey
    var name: String? = null

    @PrimaryKey
    var id: Int = 0

    @Column
    var anotherColumn: Char = ' '
}
