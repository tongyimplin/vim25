package com.vmware.vim25;

import com.vmware.vim25.ArrayOfID;
import com.vmware.vim25.ID;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfID", propOrder = {"id"})
public class ArrayOfID {
  @XmlElement(name = "ID")
  protected List<ID> id;
  
  public List<ID> getID() {
    if (this.id == null)
      this.id = new ArrayList<>(); 
    return this.id;
  }
}
