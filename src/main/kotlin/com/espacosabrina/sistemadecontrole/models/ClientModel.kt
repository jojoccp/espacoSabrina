package com.espacosabrina.sistemadecontrole.models

import org.hibernate.annotations.GenericGenerator
import java.util.UUID
import javax.persistence.*


@Entity
@Table(name = "CLIENT")
class ClientModel (

    @Id
    var clientId: String,
    @Column
    var clientName: String,
    @Column
    var clientCellphone: String

)

