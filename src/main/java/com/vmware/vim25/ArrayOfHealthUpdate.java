package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHealthUpdate;
import com.vmware.vim25.HealthUpdate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHealthUpdate", propOrder = {"healthUpdate"})
public class ArrayOfHealthUpdate {
  @XmlElement(name = "HealthUpdate")
  protected List<HealthUpdate> healthUpdate;
  
  public List<HealthUpdate> getHealthUpdate() {
    if (this.healthUpdate == null)
      this.healthUpdate = new ArrayList<>(); 
    return this.healthUpdate;
  }
}
