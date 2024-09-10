package com.rest.RestServiceDoc.dao.entity.order;

import com.rest.RestServiceDoc.dao.entity.book.Book;
import com.rest.RestServiceDoc.dao.entity.book.StatusBook;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Order")
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Book book;
    @Column
    private Integer quantity;
    @Column
    private LocalDateTime shipDate;
    @Column
    private StatusOrder statusOrder;
    @Column
    private boolean complete;
}
