package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FloppyImageFileQuery;
import com.vmware.vim25.FolderFileQuery;
import com.vmware.vim25.IsoImageFileQuery;
import com.vmware.vim25.VmConfigFileQuery;
import com.vmware.vim25.VmDiskFileQuery;
import com.vmware.vim25.VmLogFileQuery;
import com.vmware.vim25.VmNvramFileQuery;
import com.vmware.vim25.VmSnapshotFileQuery;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileQuery")
@XmlSeeAlso({VmNvramFileQuery.class, FolderFileQuery.class, VmLogFileQuery.class, VmDiskFileQuery.class, IsoImageFileQuery.class, VmSnapshotFileQuery.class, VmConfigFileQuery.class, FloppyImageFileQuery.class})
public class FileQuery extends DynamicData {}
