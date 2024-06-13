package com.vmware.vim25;

import com.vmware.vim25.ArrayOfObjectContent;
import com.vmware.vim25.ObjectContent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfObjectContent", propOrder = {"objectContent"})
public class ArrayOfObjectContent {
  @XmlElement(name = "ObjectContent")
  protected List<ObjectContent> objectContent;
  
  public List<ObjectContent> getObjectContent() {
    if (this.objectContent == null)
      this.objectContent = new ArrayList<>(); 
    return this.objectContent;
  }
}
