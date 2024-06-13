package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtension;
import com.vmware.vim25.Extension;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtension", propOrder = {"extension"})
public class ArrayOfExtension {
  @XmlElement(name = "Extension")
  protected List<Extension> extension;
  
  public List<Extension> getExtension() {
    if (this.extension == null)
      this.extension = new ArrayList<>(); 
    return this.extension;
  }
}
