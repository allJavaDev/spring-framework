package com.alljavadev.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cinema")
@Data
@NoArgsConstructor
public class Cinema extends BaseEntity {
}
