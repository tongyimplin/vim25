package com.vmware.vim25;

import com.vmware.vim25.ArrayOfImportSpec;
import com.vmware.vim25.ImportSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImportSpec", propOrder = {"importSpec"})
public class ArrayOfImportSpec {
  @XmlElement(name = "ImportSpec")
  protected List<ImportSpec> importSpec;
  
  public List<ImportSpec> getImportSpec() {
    if (this.importSpec == null)
      this.importSpec = new ArrayList<>(); 
    return this.importSpec;
  }
}
