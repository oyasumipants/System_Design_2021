package table_teniss.domain.repository.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matches")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(unique = true)
    private String tournamentId;

    @Column(name = "result", nullable = false)
    private String result;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
