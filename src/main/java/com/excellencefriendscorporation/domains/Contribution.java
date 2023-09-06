package com.excellencefriendscorporation.domains;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name="CONTRIBUTION")
public class Contribution {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Integer id;
   private Double amount;
   @OneToOne(cascade = CascadeType.ALL, targetEntity = Contributor.class)
   @JoinColumn(name = "contributor_id", referencedColumnName = "id")
   private Contributor contributor;

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Contribution that = (Contribution) o;
      return Objects.equals(id, that.id) && Objects.equals(amount, that.amount) && Objects.equals(contributor, that.contributor);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, amount, contributor);
   }
}
