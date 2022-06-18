package com.espacosabrina.sistemadecontrole.models

import javax.persistence.*

@Entity
@Table(name = "TB_CLIENT")
class ClientModel (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var idClient: Int,
    @Column
    var clientName: String,
    @Column
    var clientCellphone: String

)

