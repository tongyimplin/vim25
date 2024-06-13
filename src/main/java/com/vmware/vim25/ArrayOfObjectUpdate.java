package com.vmware.vim25;

import com.vmware.vim25.ArrayOfObjectUpdate;
import com.vmware.vim25.ObjectUpdate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfObjectUpdate", propOrder = {"objectUpdate"})
public class ArrayOfObjectUpdate {
  @XmlElement(name = "ObjectUpdate")
  protected List<ObjectUpdate> objectUpdate;
  
  public List<ObjectUpdate> getObjectUpdate() {
    if (this.objectUpdate == null)
      this.objectUpdate = new ArrayList<>(); 
    return this.objectUpdate;
  }
}
