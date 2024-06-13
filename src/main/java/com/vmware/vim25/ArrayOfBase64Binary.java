package com.vmware.vim25;

import com.vmware.vim25.ArrayOfBase64Binary;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBase64Binary", propOrder = {"base64Binary"})
public class ArrayOfBase64Binary {
  protected List<byte[]> base64Binary;
  
  public List<byte[]> getBase64Binary() {
    if (this.base64Binary == null)
      this.base64Binary = (List)new ArrayList<>(); 
    return this.base64Binary;
  }
}
