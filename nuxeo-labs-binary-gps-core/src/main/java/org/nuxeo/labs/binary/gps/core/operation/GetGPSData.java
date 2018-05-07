package org.nuxeo.labs.binary.gps.core.operation;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Context;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.annotations.Param;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.PathRef;
import org.nuxeo.ecm.core.schema.types.TypeException;

/**
 *
 */
@Operation(id = GetGPSData.ID, category = Constants.CAT_DOCUMENT, label = "Get GPS Data", description = "Get GPS data using exiftool with the -n switch.")
public class GetGPSData {

  public static final String ID = "Document.GetGPSData";

  private static final Log log = LogFactory.getLog(GetGPSData.class);

  @Context
  protected CoreSession session;

  @Param(name = "longitudeField", required = false)
  protected String longitudeField;

  @Param(name = "latitudeField", required = false)
  protected String latitudeField;

  @Param(name = "positionField", required = false)
  protected String positionField;

  @OperationMethod
  public DocumentModel run(DocumentModel input) throws TypeException {
    // Make sure the document is a Picture
    if (!input.getType().equals("Picture"))
      throw new TypeException("Picture document required");


    // Make sure the document has the gps facet
    // If not, add the gps facet
    // Extract GPS metadata
    // Map GPS metadata to schema fields

    return input;
  }
}
