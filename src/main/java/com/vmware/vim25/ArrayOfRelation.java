package com.vmware.vim25;

import com.vmware.vim25.ArrayOfRelation;
import com.vmware.vim25.Relation;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRelation", propOrder = {"relation"})
public class ArrayOfRelation {
  @XmlElement(name = "Relation")
  protected List<Relation> relation;
  
  public List<Relation> getRelation() {
    if (this.relation == null)
      this.relation = new ArrayList<>(); 
    return this.relation;
  }
}
