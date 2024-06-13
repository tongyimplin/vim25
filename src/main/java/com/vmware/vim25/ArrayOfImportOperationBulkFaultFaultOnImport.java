package com.vmware.vim25;

import com.vmware.vim25.ArrayOfImportOperationBulkFaultFaultOnImport;
import com.vmware.vim25.ImportOperationBulkFaultFaultOnImport;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImportOperationBulkFaultFaultOnImport", propOrder = {"importOperationBulkFaultFaultOnImport"})
public class ArrayOfImportOperationBulkFaultFaultOnImport {
  @XmlElement(name = "ImportOperationBulkFaultFaultOnImport")
  protected List<ImportOperationBulkFaultFaultOnImport> importOperationBulkFaultFaultOnImport;
  
  public List<ImportOperationBulkFaultFaultOnImport> getImportOperationBulkFaultFaultOnImport() {
    if (this.importOperationBulkFaultFaultOnImport == null)
      this.importOperationBulkFaultFaultOnImport = new ArrayList<>(); 
    return this.importOperationBulkFaultFaultOnImport;
  }
}
