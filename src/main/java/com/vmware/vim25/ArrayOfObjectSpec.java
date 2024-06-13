package com.vmware.vim25;

import com.vmware.vim25.ArrayOfObjectSpec;
import com.vmware.vim25.ObjectSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfObjectSpec", propOrder = {"objectSpec"})
public class ArrayOfObjectSpec {
  @XmlElement(name = "ObjectSpec")
  protected List<ObjectSpec> objectSpec;
  
  public List<ObjectSpec> getObjectSpec() {
    if (this.objectSpec == null)
      this.objectSpec = new ArrayList<>(); 
    return this.objectSpec;
  }
}
