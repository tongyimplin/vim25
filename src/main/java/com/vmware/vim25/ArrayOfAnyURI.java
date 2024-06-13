package com.vmware.vim25;

import com.vmware.vim25.ArrayOfAnyURI;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAnyURI", propOrder = {"anyURI"})
public class ArrayOfAnyURI {
  @XmlSchemaType(name = "anyURI")
  protected List<String> anyURI;
  
  public List<String> getAnyURI() {
    if (this.anyURI == null)
      this.anyURI = new ArrayList<>(); 
    return this.anyURI;
  }
}
