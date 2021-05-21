package table_teniss.domain.repository.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_matchies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserMatch {

    // 属性
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private int orderId;

    @Column(unique = true)
    private int categoryId;

}
