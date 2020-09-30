#!/bin/bash
swagger-codegen generate \
  -i anyOf.yml \
  -l kotlin-client \
  -o anyOf/swagger/kotlin \
  -Dmodels
swagger-codegen generate \
  -i anyOf.yml \
  -l swift5 \
  -o anyOf/swagger/swift \
  -Dmodels
swagger-codegen generate \
  -i anyOf.yml \
  -l typescript-angular \
  -o anyOf/swagger/typescript \
  -Dmodels
swagger-codegen generate \
  -i allOf.yml \
  -l kotlin-client \
  -o allOf/swagger/kotlin \
  -Dmodels
swagger-codegen generate \
  -i allOf.yml \
  -l swift5 \
  -o allOf/swagger/swift \
  -Dmodels
swagger-codegen generate \
  -i allOf.yml \
  -l typescript-angular \
  -o allOf/swagger/typescript \
  -Dmodels
openapi-generator generate --global-property models \
  -g kotlin \
  -o anyOf/openapi/kotlin \
  -i anyOf.yml
openapi-generator generate --global-property models \
  -g swift5 \
  -o anyOf/openapi/swift \
  -i anyOf.yml
openapi-generator generate --global-property models \
  -g typescript-angular \
  -o anyOf/openapi/typescript \
  -i anyOf.yml
openapi-generator generate --global-property models \
  -g kotlin \
  -o allOf/openapi/kotlin \
  -i allOf.yml
openapi-generator generate --global-property models \
  -g swift5 \
  -o allOf/openapi/swift \
  -i allOf.yml
openapi-generator generate --global-property models \
  -g typescript-angular \
  -o allOf/openapi/typescript \
  -i allOf.yml