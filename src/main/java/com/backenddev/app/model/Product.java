package com.backenddev.app.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 651005999695257970L;

	private Integer id;
	
	private String name;
	
	private Long price;
	
	private boolean availability;
}
