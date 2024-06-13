package com.vmware.vim25;

import com.vmware.vim25.ArrayOfUri;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUri", propOrder = {"uri"})
public class ArrayOfUri {
  @XmlSchemaType(name = "anyURI")
  protected List<String> uri;
  
  public List<String> getUri() {
    if (this.uri == null)
      this.uri = new ArrayList<>(); 
    return this.uri;
  }
}
